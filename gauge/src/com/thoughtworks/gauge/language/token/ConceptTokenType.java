/*
 * Copyright (C) 2020 ThoughtWorks, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.thoughtworks.gauge.language.token;

import com.intellij.psi.tree.IElementType;
import com.thoughtworks.gauge.language.Concept;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public final class ConceptTokenType extends IElementType {
  public ConceptTokenType(@NotNull @NonNls String debugName) {
    super(debugName, Concept.INSTANCE);
  }

  @Override
  public String toString() {
    return "Concept." + super.toString();
  }
}
