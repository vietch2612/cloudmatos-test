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
![expected_rusult](https://github.com/vietch2612/cloudmatos-test/blob/main/src/test/resources/reports/expected_result.png?raw=true)
## Automation test
### Tech stack
* Languages: Java
* Frameworks: Selenium, TestNG
* Reporting: Allure Report
### Videos & Screenshots
* Video ![expected_rusult](https://github.com/vietch2612/cloudmatos-test/blob/main/src/test/resources/reports/video.mp4?raw=true)
* Screenshots (Test Report)
### Logs
* testing.log
