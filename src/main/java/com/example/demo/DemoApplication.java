package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/")
    public String hello() {
      return String.format("What is Red Hat OpenShift?
   Red Hat OpenShift is a Kubernetes-based enterprise container platform that helps developers and IT teams build, deploy,
 and manage applications at scale. It provides a secure, automated, and self-service platform for running containerized workloads,
  with features like built-in CI/CD, monitoring, multi-tenancy, and developer tools.

What are OpenShift Pipelines?
OpenShift Pipelines is Red Hat’s CI/CD framework based on Tekton, designed to build, test, and deploy applications on OpenShift.
It enables you to define CI/CD workflows as Kubernetes-native objects, using custom Tasks and Pipelines.
It supports fully automated, cloud-native, and scalable DevOps workflows without needing a central CI server.");
    }
}