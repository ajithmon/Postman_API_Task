package com.automation.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CreateResponsePojo {
   CreateRequestPojo createRequestPojo;
   int id;
   String createdAt;
}
