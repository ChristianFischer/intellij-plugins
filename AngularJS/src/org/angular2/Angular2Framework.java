// Copyright 2000-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2;

import com.intellij.javascript.web.WebFramework;
import com.intellij.javascript.web.lang.html.WebFrameworkHtmlFileType;
import org.angular2.lang.html.Angular2HtmlFileType;
import org.angular2.lang.svg.Angular2SvgFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class Angular2Framework extends WebFramework {

  @NotNull
  public static WebFramework getInstance() {
    return Objects.requireNonNull(WebFramework.get("angular"));
  }

  @NotNull
  @Override
  public String getDisplayName() {
    return "Angular";
  }

  @Nullable
  @Override
  public WebFrameworkHtmlFileType getHtmlFileType() {
    return Angular2HtmlFileType.INSTANCE;
  }

  @Nullable
  @Override
  public WebFrameworkHtmlFileType getSvgFileType() {
    return Angular2SvgFileType.INSTANCE;
  }

}
