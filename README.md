# <img src="https://purepng.com/public/uploads/large/purepng.com-calculator-icon-ios-7symbolsiconsapple-iosiosios-7-iconsios-7-721522596499jdlnz.png" width="20px"></img> Calculator OSGi
## An OSGi example which illustrates core OSGi principles.

This repository contains two Maven projects: [Calculator Consumer](https://github.com/danielgospodinow/Calculator-OSGi/tree/master/CalculatorConsumer) and [Calculator Provider](https://github.com/danielgospodinow/Calculator-OSGi/tree/master/CalculatorProvider).

Both projects generate an OSGi bundle with the help of [Apache's bundle plugin](https://felix.apache.org/documentation/subprojects/apache-felix-maven-bundle-plugin-bnd.html) for Maven - one service provider bundle and one service consumer bundle.

For further details, check their README files in their respective folders.

In order to try out the example, you should run <code>mvn clean install</code> for both Maven projects and install the two generated bundles onto an OSGi container like [Apache Karaf](https://karaf.apache.org/) or [Knopflerfish](https://www.knopflerfish.org/).

They should be generated in the following order:

- [Calculator Provider](https://github.com/danielgospodinow/Calculator-OSGi/tree/master/CalculatorProvider)
- [Calculator Consumer](https://github.com/danielgospodinow/Calculator-OSGi/tree/master/CalculatorConsumer)

The order in which the bundles will be generated <b>matters</b>! This is because the [Calculator Consumer](https://github.com/danielgospodinow/Calculator-OSGi/tree/master/CalculatorConsumer) Maven project has a dependency on the [Calculator Provider](https://github.com/danielgospodinow/Calculator-OSGi/tree/master/CalculatorProvider) bundle and since Maven will store the [Calculator Provider](https://github.com/danielgospodinow/Calculator-OSGi/tree/master/CalculatorProvider) bundle into the local repository after the Maven <code>install</code> command, the consumer bundle will resolve it.

The generated bundles can the found in the <b>target</b> folder in each project.

#### Notes
If you're planning to use [Apache Karaf](https://karaf.apache.org/) first be sure to install the [Service Component Runtime](https://felix.apache.org/documentation/subprojects/apache-felix-service-component-runtime.html). Just run in Karaf's command line the following command <code>feature:install scr</code>.
[Knopflerfish](https://www.knopflerfish.org/) comes out of the box with this feature.