# Application for the QA Engineer position

## Test Case
### Summary
Verify that AWS EKS security groups allow incoming traffic only on TCP port 443
### Test Steps
1. Navigate to https://aws.amazon.com
2. Click the "Sign in" button
3. Enter IAM account
4. Click the "Sign in" button
5. Navigate to the EKS service
6. Click the "Network tab"
7. Click the "EKS Security Group"
8. Click "Inbound rules"
9. Verify the information in the Inbound Rules table
### Expected result
1. Type should be "HTTPS"
2. Protocol should be "TCP"
3. Port range should be "443"
![expected_result](https://github.com/vietch2612/cloudmatos-test/blob/main/src/test/resources/reports/expected_result.png?raw=true)

## Automation test

### Tech stack
* Languages: Java
* Frameworks: Selenium, TestNG
* Reporting: Allure Report

### Videos & Screenshots
* Video https://user-images.githubusercontent.com/14076603/177031221-96cc2b41-5a05-4b15-ae01-3d992e58fd79.mp4

#### Screenshots
* Test Report ![test_report](https://github.com/vietch2612/cloudmatos-test/blob/main/src/test/resources/reports/test_report.png?raw=true)
* MatosSphere application. 
** I'm not ready sure what kind of screenshots we want to capture in this case because we not running test on the MatosSphere webstie).
** This is my infrasucture I've added ![CleanShot 2022-07-03 at 15 24 36](https://user-images.githubusercontent.com/14076603/177031546-b42d64f5-5f0c-405f-9e6a-20b7a03d0744.png)

### Logs
* [testing.log](https://github.com/vietch2612/cloudmatos-test/blob/main/testing.log)

### How to run
#### Requirements
1. Install Java SDK
2. Install Maven
#### Run
```mvn clean test```
