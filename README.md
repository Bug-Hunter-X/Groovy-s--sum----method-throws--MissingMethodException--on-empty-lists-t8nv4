# Groovy `sum()` Method Exception on Empty Lists

This repository demonstrates a common error encountered when using the `sum()` method in Groovy with empty lists.  The `sum()` method, while convenient for summing numerical collections, throws a `MissingMethodException` if the list is empty.  This README explains the issue and provides a robust solution.

## Problem

Groovy's `sum()` method is designed to calculate the sum of numerical elements within a collection.  However, when invoked on an empty list, it unexpectedly throws a `MissingMethodException`. This is because the method's implementation does not specifically handle the case of an empty input.

## Solution

The solution involves adding a check to handle empty lists gracefully. We'll use the ternary operator to return 0 if the list is empty; otherwise, we calculate the sum using the standard `sum()` method. This ensures that our code remains robust and error-free, regardless of the input list's contents.