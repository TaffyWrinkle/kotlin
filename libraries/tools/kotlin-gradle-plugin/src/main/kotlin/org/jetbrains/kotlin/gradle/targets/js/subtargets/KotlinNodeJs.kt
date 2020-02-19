/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.js.subtargets

import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJsCompilation
import org.jetbrains.kotlin.gradle.targets.js.KotlinJsTarget
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsNodeDsl
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec
import org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest
import javax.inject.Inject

open class KotlinNodeJs @Inject constructor(target: KotlinJsTarget) :
    KotlinJsSubTarget(target, "node"),
    KotlinJsNodeDsl {
    override val testTaskDescription: String
        get() = "Run all ${target.name} tests inside nodejs using the builtin test framework"

    private val runTaskName = disambiguateCamelCased("run")

    override fun produceKotlinLibrary() {
        super.produceKotlinLibrary()
        target.irTarget?.nodejs?.produceKotlinLibrary()
    }

    override fun produceExecutable() {
        super.produceExecutable()
        target.irTarget?.nodejs?.produceExecutable()
    }

    override fun configure() {
        super.configure()
        nodejsProducingConfiguredHandlers.forEach { handler ->
            handler(this)
        }
    }

    override fun runTask(body: NodeJsExec.() -> Unit) {
        (project.tasks.getByName(runTaskName) as NodeJsExec).body()
    }

    override fun configureDefaultTestFramework(testTask: KotlinJsTest) {
        testTask.useMocha { }
    }

    override fun configureMain(compilation: KotlinJsCompilation) {
        configureRun(compilation)
    }

    private fun configureRun(
        compilation: KotlinJsCompilation
    ) {
        val runTaskHolder = NodeJsExec.create(compilation, disambiguateCamelCased(RUN_TASK_NAME)) {
            inputFileProperty.set(compilation.compileKotlinTask.outputFile)
        }
        target.runTask.dependsOn(runTaskHolder)
    }

    override fun configureBuildVariants() {
    }

    fun whenProducingConfigured(body: KotlinNodeJs.() -> Unit) {
        if (producingConfigured) {
            this.body()
        } else {
            nodejsProducingConfiguredHandlers += body
        }
    }
}