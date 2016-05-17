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
package com.torchmind.stockpile.server.entity;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <strong>Profile</strong>
 *
 * Represents a cached Minecraft profile.
 *
 * @author <a href="mailto:johannesd@torchmind.com">Johannes Donath</a>
 */
@Entity
@Table(name = "profile")
public class Profile extends BaseEntity {
        @OneToMany(orphanRemoval = true, mappedBy = "profile")
        private final List<DisplayName> names;
        @OneToMany(orphanRemoval = true, mappedBy = "profile")
        private final List<ProfileProperty> properties;

        public Profile() {
                this.names = new ArrayList<>();
                this.properties = new ArrayList<>();
        }

        /**
         * Retrieves a list of associated names.
         * @return a list of names.
         */
        @Nonnull
        public List<DisplayName> getNames() {
                return Collections.unmodifiableList(this.names);
        }

        /**
         * Retrieves a list of associated properties.
         * @return a list of properties.
         */
        @Nonnull
        public List<ProfileProperty> getProperties() {
                return Collections.unmodifiableList(this.properties);
        }
}