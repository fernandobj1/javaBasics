package com.example.restFulConsumer;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote (String type, Value value){

}
