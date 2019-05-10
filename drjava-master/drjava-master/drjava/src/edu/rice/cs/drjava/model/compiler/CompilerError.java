/*BEGIN_COPYRIGHT_BLOCK
 *
 * Copyright (c) 2001-2017, JavaPLT group at Rice University (drjava@rice.edu)
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the names of DrJava, the JavaPLT group, Rice University, nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * This software is Open Source Initiative approved Open Source Software.
 * Open Source Initative Approved is a trademark of the Open Source Initiative.
 * 
 * This file is part of DrJava.  Download the current version of this project
 * from http://www.drjava.org/ or http://sourceforge.net/projects/drjava/
 * 
 * END_COPYRIGHT_BLOCK*/

package edu.rice.cs.drjava.model.compiler;

import java.io.File;

import edu.rice.cs.drjava.model.DJError;


/** A class to represent source errors and warnings generated by the compiler.  This class enables DrJava
  * to highlight compiler error text.
  * @version $Id$
  */
public class CompilerError extends DJError {
  
  /** Constructor.
   * @param  file the file where the error occurred
   * @param  lineNumber the line number of the error
   * @param  startColumn the starting column of the error
   * @param  message  the error message
   * @param  isWarning true if this is a warning; false if it's an error
   */
  public CompilerError(File file, int lineNumber, int startColumn, String message, boolean isWarning) { 
    super(file, lineNumber, startColumn, message, isWarning);
  }
  
  /** Constructor for an DJError with an associated file but no location in the source 
   * @param  file the file where the error occurred
   * @param  message  the error message
   * @param  isWarning true if this is a warning; false if it's an error
   */
  public CompilerError(File file, String message, boolean isWarning) { super(file, message, isWarning); }
  
  /** Constructor for CompilerErrors without files.
   * @param message the error message
   * @param  isWarning true if this is a warning; false if it's an error
   */
  public CompilerError(String message, boolean isWarning) { super(message, isWarning); }
}
  