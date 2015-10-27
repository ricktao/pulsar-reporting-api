/*******************************************************************************
*  Copyright © 2012-2015 eBay Software Foundation
*  This program is dual licensed under the MIT and Apache 2.0 licenses.
*  Please see LICENSE for more information.
*******************************************************************************/
package com.ebay.pulsar.analytics.query.result;

import java.util.Map;

/**
 * 
 * @author mingmwang
 *
 */
public interface ResultEnricher {
	public <T> Map<T, ResultNode>  enrich(Iterable<T> idList);
}
