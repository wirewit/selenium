/*
Copyright 2011 WebDriver committers
Copyright 2011 Google Inc.
Copyright 2011 Software Freedom Conservancy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


package org.openqa.selenium.firefox;

import java.io.IOException;

public class NativeEventsFirefoxDriver extends FirefoxDriver {
  public NativeEventsFirefoxDriver() throws IOException {
    super(createNativeEventsEnabledProfile());
  }

  private static FirefoxProfile createNativeEventsEnabledProfile() throws IOException {
    FirefoxProfile profile = new FirefoxProfile();
    profile.setEnableNativeEvents(true);

    if (Boolean.getBoolean("webdriver.debug")) {
      Firebug.addTo(profile);
    }

    return profile;
  }
}