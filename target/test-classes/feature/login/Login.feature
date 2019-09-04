
@Btrix24_application
Feature: Login
  As a user I should be able to create a task from activity stream.

  Background:
    Given user logs in with following credentials
      | username | helpdesk60@cybertekschool.com |
      | password | UserUser  |
    Then user navigates to "Activity Stream" and "Task"

  @login
  Scenario: user can create new task
    And  user add the "task name" and click send to create a Task

    @test2
    Scenario: user can upload link regarding to new task
      And  user click link option and add "hello world again" and "www.google.com"
      Then user finish the Task creation

  @test3
      Scenario: user set up a deadline for new task.
        And  user add the task name and set a deadline to finish the Task creation
