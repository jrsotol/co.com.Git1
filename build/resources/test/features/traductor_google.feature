
Feature: Google Translate
  As a web user
  I want to use Google Translate
  to translate words between diferent languages
  @RunnerTags
  Scenario: Translate from source languages to target language
    Given that Romel want to use Google Translate
    When he translate the word mesa from Espanish to English
    Then he should see the word table on the screen
