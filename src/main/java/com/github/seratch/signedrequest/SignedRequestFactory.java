/* 
 * Copyright 2011 Kazuhiro Sera
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language 
 * governing permissions and limitations under the License. 
 */
package com.github.seratch.signedrequest;

import java.util.Map;

/**
 * <pre>
 * Singed Request Instance Factory.
 * An implementation of <a href="http://oauth.googlecode.com/svn/spec/ext/consumer_request/1.0/drafts/1/spec.html">OAuth Consumer Request 1.0 Draft 1</a>.
 * 
 * a.k.a OAuth Consumer Request
 * a.k.a OpenSocial Signed Request
 * a.k.a 2 Legged Auth Request
 * </pre>
 * 
 * @author <a href="mailto:seratch@gmail.com">Kazuhiro Sera</a>
 * @see <a
 *      href="http://oauth.googlecode.com/svn/spec/ext/consumer_request/1.0/drafts/1/spec.html">Specification</a>
 */
public class SignedRequestFactory {

	/**
	 * Returns {@link SignedRequest} instance.
	 * 
	 * @param realm
	 *            realm(nullable)
	 * @param consumer
	 *            OAuth consumer
	 * @return {@link SignedRequest} instance.
	 */
	public static SignedRequest getInstance(String realm, OAuthConsumer consumer) {
		return new SignedRequestImpl(realm, consumer, SignatureMethod.HMAC_SHA1);
	}

	/**
	 * Returns {@link SignedRequest} instance.
	 * 
	 * @param realm
	 *            realm(nullable)
	 * @param consumer
	 *            OAuth consumer
	 * @param additionalParameters
	 *            Additional parameters(optional)
	 * @return {@link SignedRequest} instance.
	 */
	public static SignedRequest getInstance(String realm,
			OAuthConsumer consumer, Map<String, String> additionalParameters) {
		return new SignedRequestImpl(realm, consumer,
				SignatureMethod.HMAC_SHA1, additionalParameters);
	}

	/**
	 * Returns {@link SignedRequest} instance.
	 * 
	 * @param realm
	 *            realm(nullable)
	 * @param consumer
	 *            OAuth consumer
	 * @param signatureMethod
	 *            Signature Method
	 * @return {@link SignedRequest} instance.
	 */
	public static SignedRequest getInstance(String realm,
			OAuthConsumer consumer, SignatureMethod signatureMethod) {
		return new SignedRequestImpl(realm, consumer, signatureMethod);
	}

	/**
	 * Returns {@link SignedRequest} instance.
	 * 
	 * @param realm
	 *            realm(nullable)
	 * @param consumer
	 *            OAuth consumer
	 * @param signatureMethod
	 *            Signature Method
	 * @param additionalParameters
	 *            Additional parameters(optional)
	 * @return {@link SignedRequest} instance.
	 */
	public static SignedRequest getInstance(String realm,
			OAuthConsumer consumer, SignatureMethod signatureMethod,
			Map<String, String> additionalParameters) {
		return new SignedRequestImpl(realm, consumer, signatureMethod,
				additionalParameters);
	}

}