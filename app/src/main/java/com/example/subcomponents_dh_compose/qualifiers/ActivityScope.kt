package com.example.subcomponents_dh_compose.qualifiers

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope


@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScope()
