/*************************************************************************
 * 
 * Cre8Tech Labs CONFIDENTIAL
 * __________________
 * 
 *  [2015] - [2015] Cre8Tech Labs 
 *  All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of Cre8Tech Labs and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Cre8Tech Labs
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Cre8Tech Labs.
 */
package com.github.mateuszwenus.spring_security_controller_auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;

public class HandlerInvocation {

  private final HttpServletRequest request;
  private final HttpServletResponse response;
  private final HandlerMethod method;

  public HandlerInvocation(HttpServletRequest request, HttpServletResponse response, HandlerMethod method) {
    this.request = request;
    this.response = response;
    this.method = method;
  }

  public HttpServletRequest getRequest() {
    return request;
  }

  public HttpServletResponse getResponse() {
    return response;
  }

  public HandlerMethod getMethod() {
    return method;
  }
}
