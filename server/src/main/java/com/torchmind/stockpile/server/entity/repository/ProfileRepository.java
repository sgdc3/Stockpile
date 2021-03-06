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
package com.torchmind.stockpile.server.entity.repository;

import com.torchmind.stockpile.server.entity.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.annotation.Nonnull;
import java.time.Instant;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * <strong>Profile Repository</strong>
 *
 * Provides a management interface for finding, creating, updating and deleting Minecraft profiles.
 * Note: This interface is implemented by Spring during runtime.
 *
 * @author <a href="mailto:johannesd@torchmind.com">Johannes Donath</a>
 */
public interface ProfileRepository extends PagingAndSortingRepository<Profile, UUID> {

        /**
         * Searches for a set of profiles that were last seen before the supplied timestamp occurred.
         *
         * @param lastSeen a timestamp.
         * @return a stream of profiles.
         */
        @Nonnull
        Stream<Profile> findByLastSeenLessThanOrderByLastSeenDesc(@Nonnull Instant lastSeen);
}
