/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsTestWithOldJvmBackendGenerated extends AbstractDiagnosticsTestWithOldJvmBackend {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
    }

    public void testAllFilesPresentInTestsWithJvmBackend() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
    }

    @TestMetadata("inlineCycle.kt")
    public void testInlineCycle() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithJvmBackend/inlineCycle.kt");
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DuplicateJvmSignature extends AbstractDiagnosticsTestWithOldJvmBackend {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
        }

        public void testAllFilesPresentInDuplicateJvmSignature() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
        }

        @TestMetadata("caseInProperties.kt")
        public void testCaseInProperties() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/caseInProperties.kt");
        }

        @TestMetadata("vararg.kt")
        public void testVararg() throws Exception {
            runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/vararg.kt");
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class AccidentalOverrides extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            @TestMetadata("accidentalOverrideFromGrandparent.kt")
            public void testAccidentalOverrideFromGrandparent() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/accidentalOverrideFromGrandparent.kt");
            }

            public void testAllFilesPresentInAccidentalOverrides() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("classFunctionOverriddenByProperty.kt")
            public void testClassFunctionOverriddenByProperty() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classFunctionOverriddenByProperty.kt");
            }

            @TestMetadata("classFunctionOverriddenByPropertyInConstructor.kt")
            public void testClassFunctionOverriddenByPropertyInConstructor() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classFunctionOverriddenByPropertyInConstructor.kt");
            }

            @TestMetadata("classFunctionOverriddenByPropertyNoGetter.kt")
            public void testClassFunctionOverriddenByPropertyNoGetter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classFunctionOverriddenByPropertyNoGetter.kt");
            }

            @TestMetadata("classPropertyOverriddenByFunction.kt")
            public void testClassPropertyOverriddenByFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/classPropertyOverriddenByFunction.kt");
            }

            @TestMetadata("defaultFunction.kt")
            public void testDefaultFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/defaultFunction.kt");
            }

            @TestMetadata("delegatedFunctionOverriddenByProperty_old.kt")
            public void testDelegatedFunctionOverriddenByProperty_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/delegatedFunctionOverriddenByProperty_old.kt");
            }

            @TestMetadata("genericClassFunction.kt")
            public void testGenericClassFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/genericClassFunction.kt");
            }

            @TestMetadata("privateClassFunctionOverriddenByProperty.kt")
            public void testPrivateClassFunctionOverriddenByProperty() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/privateClassFunctionOverriddenByProperty.kt");
            }

            @TestMetadata("traitFunctionOverriddenByPropertyNoImpl.kt")
            public void testTraitFunctionOverriddenByPropertyNoImpl() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitFunctionOverriddenByPropertyNoImpl.kt");
            }

            @TestMetadata("traitFunctionOverriddenByProperty_old.kt")
            public void testTraitFunctionOverriddenByProperty_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitFunctionOverriddenByProperty_old.kt");
            }

            @TestMetadata("traitPropertyOverriddenByFunctionNoImpl.kt")
            public void testTraitPropertyOverriddenByFunctionNoImpl() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitPropertyOverriddenByFunctionNoImpl.kt");
            }

            @TestMetadata("traitPropertyOverriddenByFunction_old.kt")
            public void testTraitPropertyOverriddenByFunction_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/accidentalOverrides/traitPropertyOverriddenByFunction_old.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Bridges extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInBridges() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("class_old.kt")
            public void testClass_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges/class_old.kt");
            }

            @TestMetadata("fakeOverrideTrait_old.kt")
            public void testFakeOverrideTrait_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges/fakeOverrideTrait_old.kt");
            }

            @TestMetadata("trait_old.kt")
            public void testTrait_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/bridges/trait_old.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Erasure extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInErasure() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("clashFromInterfaceAndSuperClass_old.kt")
            public void testClashFromInterfaceAndSuperClass_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/clashFromInterfaceAndSuperClass_old.kt");
            }

            @TestMetadata("collections.kt")
            public void testCollections() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/collections.kt");
            }

            @TestMetadata("delegateToTwoTraits_old.kt")
            public void testDelegateToTwoTraits_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/delegateToTwoTraits_old.kt");
            }

            @TestMetadata("delegationAndOwnMethod_old.kt")
            public void testDelegationAndOwnMethod_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/delegationAndOwnMethod_old.kt");
            }

            @TestMetadata("delegationToTraitImplAndOwnMethod_old.kt")
            public void testDelegationToTraitImplAndOwnMethod_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/delegationToTraitImplAndOwnMethod_old.kt");
            }

            @TestMetadata("extensionProperties.kt")
            public void testExtensionProperties() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/extensionProperties.kt");
            }

            @TestMetadata("genericType.kt")
            public void testGenericType() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/genericType.kt");
            }

            @TestMetadata("inheritFromTwoTraits_old.kt")
            public void testInheritFromTwoTraits_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/inheritFromTwoTraits_old.kt");
            }

            @TestMetadata("kotlinAndJavaCollections.kt")
            public void testKotlinAndJavaCollections() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/kotlinAndJavaCollections.kt");
            }

            @TestMetadata("nullableType.kt")
            public void testNullableType() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/nullableType.kt");
            }

            @TestMetadata("superTraitAndDelegationToTraitImpl_old.kt")
            public void testSuperTraitAndDelegationToTraitImpl_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/superTraitAndDelegationToTraitImpl_old.kt");
            }

            @TestMetadata("twoTraitsAndOwnFunction_old.kt")
            public void testTwoTraitsAndOwnFunction_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/twoTraitsAndOwnFunction_old.kt");
            }

            @TestMetadata("typeMappedToJava.kt")
            public void testTypeMappedToJava() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeMappedToJava.kt");
            }

            @TestMetadata("typeParameter.kt")
            public void testTypeParameter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameter.kt");
            }

            @TestMetadata("typeParameterWithBound.kt")
            public void testTypeParameterWithBound() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameterWithBound.kt");
            }

            @TestMetadata("typeParameterWithTwoBounds.kt")
            public void testTypeParameterWithTwoBounds() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameterWithTwoBounds.kt");
            }

            @TestMetadata("typeParameterWithTwoBoundsInWhere.kt")
            public void testTypeParameterWithTwoBoundsInWhere() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/erasure/typeParameterWithTwoBoundsInWhere.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class FinalMembersFromBuiltIns extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInFinalMembersFromBuiltIns() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("enumMembers.kt")
            public void testEnumMembers() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns/enumMembers.kt");
            }

            @TestMetadata("waitNotifyGetClass_old.kt")
            public void testWaitNotifyGetClass_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/finalMembersFromBuiltIns/waitNotifyGetClass_old.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class FunctionAndProperty extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInFunctionAndProperty() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("class.kt")
            public void testClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/class.kt");
            }

            @TestMetadata("classObject.kt")
            public void testClassObject() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/classObject.kt");
            }

            @TestMetadata("classPropertyInConstructor.kt")
            public void testClassPropertyInConstructor() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/classPropertyInConstructor.kt");
            }

            @TestMetadata("extensionFunctionAndNormalFunction.kt")
            public void testExtensionFunctionAndNormalFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/extensionFunctionAndNormalFunction.kt");
            }

            @TestMetadata("extensionPropertyAndFunction.kt")
            public void testExtensionPropertyAndFunction() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/extensionPropertyAndFunction.kt");
            }

            @TestMetadata("functionAndSetter.kt")
            public void testFunctionAndSetter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/functionAndSetter.kt");
            }

            @TestMetadata("functionAndVar.kt")
            public void testFunctionAndVar() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/functionAndVar.kt");
            }

            @TestMetadata("localClass.kt")
            public void testLocalClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/localClass.kt");
            }

            @TestMetadata("localClassInClass.kt")
            public void testLocalClassInClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/localClassInClass.kt");
            }

            @TestMetadata("nestedClass.kt")
            public void testNestedClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/nestedClass.kt");
            }

            @TestMetadata("object.kt")
            public void testObject() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/object.kt");
            }

            @TestMetadata("objectExpression.kt")
            public void testObjectExpression() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/objectExpression.kt");
            }

            @TestMetadata("objectExpressionInConstructor.kt")
            public void testObjectExpressionInConstructor() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/objectExpressionInConstructor.kt");
            }

            @TestMetadata("privateClassPropertyNoClash.kt")
            public void testPrivateClassPropertyNoClash() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/privateClassPropertyNoClash.kt");
            }

            @TestMetadata("topLevel.kt")
            public void testTopLevel() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/topLevel.kt");
            }

            @TestMetadata("topLevelDifferentFiles.kt")
            public void testTopLevelDifferentFiles() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/topLevelDifferentFiles.kt");
            }

            @TestMetadata("topLevelGetter.kt")
            public void testTopLevelGetter() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/topLevelGetter.kt");
            }

            @TestMetadata("trait_old.kt")
            public void testTrait_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/functionAndProperty/trait_old.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class SpecialNames extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInSpecialNames() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("classObjectCopiedField.kt")
            public void testClassObjectCopiedField() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/classObjectCopiedField.kt");
            }

            @TestMetadata("classObjectCopiedFieldObject_old.kt")
            public void testClassObjectCopiedFieldObject_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/classObjectCopiedFieldObject_old.kt");
            }

            @TestMetadata("classObject_old.kt")
            public void testClassObject_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/classObject_old.kt");
            }

            @TestMetadata("dataClassCopy.kt")
            public void testDataClassCopy() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/dataClassCopy.kt");
            }

            @TestMetadata("defaults.kt")
            public void testDefaults() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/defaults.kt");
            }

            @TestMetadata("delegationBy_old.kt")
            public void testDelegationBy_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/delegationBy_old.kt");
            }

            @TestMetadata("enum.kt")
            public void testEnum() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/enum.kt");
            }

            @TestMetadata("innerClassField_old.kt")
            public void testInnerClassField_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/innerClassField_old.kt");
            }

            @TestMetadata("instance_old.kt")
            public void testInstance_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/instance_old.kt");
            }

            @TestMetadata("propertyMetadataCache_old.kt")
            public void testPropertyMetadataCache_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/specialNames/propertyMetadataCache_old.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Statics extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInStatics() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("jkjk.kt")
            public void testJkjk() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/jkjk.kt");
            }

            @TestMetadata("kotlinClassExtendsJavaClass.kt")
            public void testKotlinClassExtendsJavaClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassExtendsJavaClass.kt");
            }

            @TestMetadata("kotlinClassExtendsJavaClassExtendsJavaClass.kt")
            public void testKotlinClassExtendsJavaClassExtendsJavaClass() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassExtendsJavaClassExtendsJavaClass.kt");
            }

            @TestMetadata("kotlinClassImplementsJavaInterface.kt")
            public void testKotlinClassImplementsJavaInterface() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassImplementsJavaInterface.kt");
            }

            @TestMetadata("kotlinClassImplementsJavaInterfaceExtendsJavaInteface.kt")
            public void testKotlinClassImplementsJavaInterfaceExtendsJavaInteface() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinClassImplementsJavaInterfaceExtendsJavaInteface.kt");
            }

            @TestMetadata("kotlinMembersVsJavaNonVisibleStatics.kt")
            public void testKotlinMembersVsJavaNonVisibleStatics() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/statics/kotlinMembersVsJavaNonVisibleStatics.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/synthesized")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Synthesized extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInSynthesized() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/synthesized"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("enumValuesValueOf.kt")
            public void testEnumValuesValueOf() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/synthesized/enumValuesValueOf.kt");
            }
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class TraitImpl extends AbstractDiagnosticsTestWithOldJvmBackend {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.JVM_OLD, testDataFilePath);
            }

            public void testAllFilesPresentInTraitImpl() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_OLD, true);
            }

            @TestMetadata("defaultVsNonDefault_old.kt")
            public void testDefaultVsNonDefault_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/defaultVsNonDefault_old.kt");
            }

            @TestMetadata("oneTrait_old.kt")
            public void testOneTrait_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/oneTrait_old.kt");
            }

            @TestMetadata("traitFunctionOverriddenByPropertyInTrait_old.kt")
            public void testTraitFunctionOverriddenByPropertyInTrait_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/traitFunctionOverriddenByPropertyInTrait_old.kt");
            }

            @TestMetadata("traitPropertyOverriddenByFunctionInTrait_old.kt")
            public void testTraitPropertyOverriddenByFunctionInTrait_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/traitPropertyOverriddenByFunctionInTrait_old.kt");
            }

            @TestMetadata("twoTraits_old.kt")
            public void testTwoTraits_old() throws Exception {
                runTest("compiler/testData/diagnostics/testsWithJvmBackend/duplicateJvmSignature/traitImpl/twoTraits_old.kt");
            }
        }
    }
}
