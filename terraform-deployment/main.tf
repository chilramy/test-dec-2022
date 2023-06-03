provider "aws" {
  region = "us-east-1"  # Set your desired AWS region
}

resource "aws_lambda_function" "springboot_lambda" {
  filename      = "your_application.jar"  # Path to your Spring Boot application JAR file
  function_name = "your_lambda_function_name"
  role          = aws_iam_role.lambda_role.arn
  handler       = "org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest"
  runtime       = "java11"
  timeout       = 60
}
