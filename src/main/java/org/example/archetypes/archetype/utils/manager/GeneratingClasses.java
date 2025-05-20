package org.example.archetypes.archetype.utils.manager;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 21.05.2025
 */
public class GeneratingClasses {

    public static List<String> importString(){
        return Arrays.asList(
                // 1-10: Podstawy Javy
                "IntroductionToJava",
                "HelloWorldProgram",
                "VariablesAndDataTypes",
                "ControlFlowBasics",
                "LoopsInJava",
                "MethodsAndFunctions",
                "BasicInputOutput",
                "WorkingWithStrings",
                "WorkingWithArrays",
                "BasicMathematicalOperations",

                // 11-20: Struktury sterujące i operatory
                "SwitchStatementsInJava",
                "IfElseStatements",
                "TernaryOperator",
                "ComparisonOperators",
                "LogicalOperatorsInJava",
                "BreakAndContinueInLoops",
                "NestedLoops",
                "ForEachLoopInJava",
                "LabelsInLoops",
                "ScopeOfVariables",

                // 21-30: Obiektowość w Javie
                "ObjectOrientedBasics",
                "ClassesAndObjectsInJava",
                "ConstructorsInJava",
                "InstanceAndStaticVariables",
                "MethodsInJava",
                "MethodOverloading",
                "MethodOverriding",
                "EncapsulationInJava",
                "InheritanceInJava",
                "PolymorphismInJava",

                // 31-40: Wyjątki w Javie
                "ExceptionHandlingBasics",
                "TryCatchBlocks",
                "MultipleCatchBlocks",
                "FinallyBlock",
                "ThrowingExceptions",
                "CustomExceptions",
                "CheckedAndUncheckedExceptions",
                "HandlingRuntimeExceptions",
                "HandlingCheckedExceptions",
                "ExceptionChaining",

                // 41-50: Kolekcje
                "ArrayListsInJava",
                "LinkedListsInJava",
                "HashMapsInJava",
                "HashSetsInJava",
                "TreeSetsInJava",
                "QueuesInJava",
                "DequeInJava",
                "StacksInJava",
                "IteratorsInJava",
                "CollectionsSortingInJava",

                // 51-60: Strumienie i Lambda
                "StreamsInJava",
                "LambdaExpressionsInJava",
                "FunctionalInterfacesInJava",
                "StreamFiltersInJava",
                "StreamMapInJava",
                "StreamReduceInJava",
                "CollectorsInJava",
                "MethodReferencesInJava",
                "StreamCollectorsGroupBy",
                "ParallelStreamsInJava",

                // 61-70: Programowanie funkcyjne
                "FunctionalProgrammingInJava",
                "HigherOrderFunctionsInJava",
                "ImmutabilityInJava",
                "PureFunctionsInJava",
                "FirstClassFunctionsInJava",
                "SideEffectsInJava",
                "StreamsAndLambdasInPractice",
                "OptionalsInJava",
                "MonadsInJava",
                "CurryingInJava",

                // 71-80: Zaawansowane tematy obiektowości
                "AbstractClassesInJava",
                "InterfacesInJava",
                "AbstractMethodsInJava",
                "MultipleInheritanceInJava",
                "InnerClassesInJava",
                "AnonymousClassesInJava",
                "StaticMethodsInJava",
                "NestedClassesInJava",
                "SingletonPatternInJava",
                "FactoryPatternInJava",

                // 81-90: Narzędzia i techniki w Javie
                "LoggingInJava",
                "DebuggingInJava",
                "JVMArchitecture",
                "JVMGarbageCollection",
                "JVMMemoryManagement",
                "JITCompilationInJava",
                "ReflectionInJava",
                "AnnotationsInJava",
                "GenericsInJava",
                "TypeInferenceInJava",

                // 91-100: Wzorce projektowe
                "SingletonPattern",
                "FactoryPattern",
                "ObserverPattern",
                "StrategyPattern",
                "DecoratorPattern",
                "AdapterPattern",
                "ProxyPattern",
                "CommandPattern",
                "IteratorPattern",
                "CompositePattern",

                // 101-110: Kolekcje i algorytmy
                "SortingAlgorithms",
                "SearchingAlgorithms",
                "MergeSortInJava",
                "QuickSortInJava",
                "BubbleSortInJava",
                "InsertionSortInJava",
                "SelectionSortInJava",
                "BinarySearchInJava",
                "TreeTraversalsInJava",
                "GraphTraversalsInJava",

                // 111-120: Programowanie równoległe
                "MultithreadingInJava",
                "ConcurrencyInJava",
                "SynchronizationInJava",
                "ExecutorServiceInJava",
                "ThreadPoolInJava",
                "LocksAndSemaphoresInJava",
                "DeadlockInJava",
                "ConcurrencyUtilitiesInJava",
                "AtomicOperationsInJava",
                "ForkJoinPoolInJava",

                // 121-130: Praca z plikami i bazami danych
                "FileHandlingInJava",
                "ReadingFromFileInJava",
                "WritingToFileInJava",
                "SerializationInJava",
                "DeserializationInJava",
                "DatabaseConnectivityInJava",
                "JDBCConnectionInJava",
                "PreparedStatementInJava",
                "StatementAndResultSetInJava",
                "SQLInjectionPreventionInJava",

                // 131-140: Testowanie jednostkowe
                "JUnitBasics",
                "WritingFirstJUnitTest",
                "JUnitAssertions",
                "MockingWithMockito",
                "IntegrationTestingInJava",
                "TestDrivenDevelopment",
                "TestSuitesInJUnit",
                "JUnitParametersInTests",
                "MockitoAnnotationsInJava",
                "JUnit5Features",

                // 141-150: Wprowadzenie do Maven
                "IntroductionToMaven",
                "SettingUpMavenProject",
                "MavenBuildLifeCycle",
                "MavenDependencies",
                "MavenPlugins",
                "CreatingMavenArtifacts",
                "MavenPomFile",
                "MavenRepositories",
                "MavenProfiles",
                "MavenGoalsAndPhases",

                // 151-160: Maven w praktyce
                "DependencyManagementInMaven",
                "MavenSettingsFile",
                "MavenBuildCommands",
                "MavenRepositoryManagement",
                "MavenPluginConfiguration",
                "BuildingWithMaven",
                "MavenInstallGoal",
                "MavenCleanGoal",
                "MavenTestGoal",
                "MavenPackageGoal",

                // 161-170: Web Development
                "IntroductionToServlets",
                "CreatingFirstServlet",
                "HTTPRequestsInJava",
                "TomcatServerSetup",
                "JavaServerPages",
                "ServletsAndJSPIntegration",
                "WebAppDevelopmentInJava",
                "SessionManagementInJava",
                "CookiesInJava",
                "URLPatternsInJava",

                // 171-180: Spring Framework (w przyszłości)
                "IntroductionToSpringFramework",
                "SpringConfiguration",
                "SpringBeans",
                "SpringDependencyInjection",
                "SpringAnnotations",
                "SpringMVC",
                "SpringBootIntroduction",
                "SpringBootRestApi",
                "SpringBootApplicationStructure",
                "SpringBootTesting",

                // 181-190: Narzędzia i technologie zewnętrzne
                "UsingGitForVersionControl",
                "JenkinsCI",
                "DockerIntroduction",
                "CI/CDWithMaven",
                "ApacheKafkaBasics",
                "RabbitMQForMessaging",
                "RedisInJava",
                "ElasticSearchInJava",
                "KubernetesInJava",
                "AWSAndJava",

                // 191-200: Projekty i praktyki
                "ProjectSetupInJava",
                "VersionControlWithGit",
                "WorkingWithOpenSourceProjects",
                "CollaborationWithGitHub",
                "BuildingRealWorldApplications",
                "AgileDevelopmentMethodologies",
                "ContinuousIntegration",
                "DeploymentInJava",
                "FinalProjectDesign",
                "FinalProjectImplementation"
        );
    }
}
