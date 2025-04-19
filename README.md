# multi_module_project
This project contains the setup related to multi module project

Refer
https://www.youtube.com/watch?v=XIg7O7ndXqs&list=PLlc_LrU50tlgWOrybr-Ppffg6T_1cXeUb&ab_channel=AJAUTOMATION

Terminology:
Parent Project or Aggregator Project — the main project with a pom.xml that includes <modules>.
Module — a sub-project that is listed in the parent POM.
Multi-Module Project — the overall setup.

Use of multi-module projects ?
Centralized Dependency Management
Single Build for All Modules
Code reuse

What is the use dependency management if have mention the dependency in modules again ?
No need to mention the version if it is mentioned in the parent pom.
If you forget to include the dependency in a module — even if it's in the parent POM's <dependencyManagement> — the module won't get it.
<dependencyManagement> doesn't inject dependencies automatically. It just defines version rules.
Basically the parent POM acts like version control for shared dependencies.
