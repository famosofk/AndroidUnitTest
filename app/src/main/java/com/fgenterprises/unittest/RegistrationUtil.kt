package com.fgenterprises.unittest

object RegistrationUtil {

    private val existingUser = listOf("João", "Maria")

    /*
     * The input is not valid if
     * ...the username/password is empty
     * ...the username is already taken
     * ... the confirmedPassword != password
     * ...the password contains less than 2 digits
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()) return false
        if (username in existingUser) return false
        if (password != confirmedPassword) return false
        if (password.count { it.isDigit() } < 2) return false
        return true
    }
}