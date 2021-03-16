package com.fgenterprises.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test



class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput("",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct passwords returns true`() {
        val result = RegistrationUtil.validateRegistrationInput("Jorge",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput("João",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput("João",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `different passwords returns false`() {
        val result = RegistrationUtil.validateRegistrationInput("João",
            "123",
            "124"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password doesnt have minimum length returns false`() {
        val result = RegistrationUtil.validateRegistrationInput("João",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }



}