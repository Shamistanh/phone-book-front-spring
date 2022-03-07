package com.front.app.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
public class XUser {

    UUID userId;

    String name;

    String phone;
}
