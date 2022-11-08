# TypeScript

## The Problem
- Front Ends for modern web apps are very complicated
    - JS was designed to be flexible and web pages were envisoned to be much simplier
- JS lacks a lot of features that revent it from scailing well in large applications
    - Dynamically typed means that it is difficult to know what data type your variable are at any given point
    - Type Coercion everywhere means you often get result you aren't expecting
    - Tendency (as we saw) to fail without throwing an error or telling you that something is wrong

## Solution (TypeScript)
- Write in a language that has features we want **AND** that we can later ***TRANSPILE*** into JS
    - TypeScript
    - CoffeScript
    - Flow
    - Kotlin
    - Scala
- There are **LOTS** of superscript langauges that branch away from JS

## TypeScript Features
- Robust ***Type System**
    - Variables can have declared data types (unlike JS)
    - return types
    - required arguments for functions
    - etc... 
    - To summarize, it is a lot closer to Java
- OOP
    - classes
    - interfaces
    - access modifiers
- You **CAN** transpile TS into any version of JS
    - This is great if you have a legacy browser
    - This would allow you to write TS in the most modern version, but have it transpiled to an older depricated version
- It is very configurable
    - If you are really interested in messing with TS alone look into **tsconfig.json**
        - This file will contain compilation options for .ts files in the folder
