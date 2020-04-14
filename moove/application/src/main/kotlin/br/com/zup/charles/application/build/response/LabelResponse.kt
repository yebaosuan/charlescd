/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package br.com.zup.charles.application.build.response

import br.com.zup.charles.application.deployment.response.SimpleUserResponse
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class LabelResponse(
    val id: String,
    val name: String,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    val createdAt: LocalDateTime,
    val author: SimpleUserResponse,
    val hexColor: String
)