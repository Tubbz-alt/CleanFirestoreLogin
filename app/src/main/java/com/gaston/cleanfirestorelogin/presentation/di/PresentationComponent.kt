/*
 *
 *  * Copyright (C) 2019 Gastón Luis Saillén.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.gaston.cleanfirestorelogin.presentation.di

import com.gaston.cleanfirestorelogin.presentation.auth.login.view.SignInActivity
import com.gaston.cleanfirestorelogin.presentation.auth.passwordrecover.view.PasswordRecoverActivity
import com.gaston.cleanfirestorelogin.presentation.auth.registro.view.SignUpActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Gastón Saillén on 11 July 2019
 */

@Component(modules = [PresentationModule::class])

@Singleton
interface PresentationComponent {
    fun inject(signInActivity: SignInActivity)
    fun inject(signUpActivity: SignUpActivity)
    fun inject(passwordRecoverActivity: PasswordRecoverActivity)
}