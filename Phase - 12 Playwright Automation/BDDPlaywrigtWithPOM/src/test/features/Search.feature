Feature: Search Feature

    Background:
        Given the user launches the application

    Scenario Outline: Verify product search functionality
        When the user searches for "searchKey"
        Then the search results should be "result"

        Examples:
            | searchKey | result  |
            | iPhone    | found   |
            | Nokia     | notFound |