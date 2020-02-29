Feature: Login to Leaf taps

Scenario: Login to Leaf Taps (positive)

Given Open Browser
And Load URL
And Maximize the Window
And Set Timeout

When Enter Username as DemoSalesManage
And Enter password as crmsfa
And Click Login Button

Then Verify Logged in Name