/*
 * Copyright 2000-2005 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.debugger.engine.jdi;

import com.intellij.debugger.engine.DebugProcess;
import com.sun.jdi.ReferenceType;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lex
 * Date: Apr 2, 2004
 * Time: 8:49:42 PM
 * To change this template use File | Settings | File Templates.
 */
public interface VirtualMachineProxy {
  public List<ReferenceType> allClasses();

  public boolean versionHigher(String version);

  boolean canWatchFieldModification();

  boolean canWatchFieldAccess();

  boolean canInvokeMethods();

  DebugProcess getDebugProcess();
}
