/*
 * Copyright 2016 Johannes Donath <johannesd@torchmind.com>
 * and other copyright owners as documented in the project's IP log.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.torchmind.stockpile.server.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * <strong>Invalid Profile Identifier Exception</strong>
 *
 * Provides a utility exception which notifies the backing request handler about a bad profile identifier which has
 * been passed along with the request.
 *
 * @author <a href="mailto:johannesd@torchmind.com">Johannes Donath</a>
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidProfileIdentifierException extends IllegalArgumentException {

        public InvalidProfileIdentifierException() {
        }

        public InvalidProfileIdentifierException(String s) {
                super(s);
        }

        public InvalidProfileIdentifierException(String message, Throwable cause) {
                super(message, cause);
        }

        public InvalidProfileIdentifierException(Throwable cause) {
                super(cause);
        }
}
