package com.assessment.myapp.api;

public interface AssessmentCallback {

    void onSuccess(String res);

    void onFailure(Exception e);
}
