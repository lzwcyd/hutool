/*
 * Copyright (c) 2023 looly(loolly@aliyun.com)
 * Hutool is licensed under Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *          http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v2 for more details.
 */

package org.dromara.hutool.core.exceptions;

import org.dromara.hutool.core.text.StrUtil;

/**
 * 验证异常
 *
 * @author xiaoleilu
 */
public class ValidateException extends StatefulException {
	private static final long serialVersionUID = 6057602589533840889L;

	public ValidateException() {
	}

	public ValidateException(final String msg) {
		super(msg);
	}

	public ValidateException(final String messageTemplate, final Object... params) {
		super(StrUtil.format(messageTemplate, params));
	}

	public ValidateException(final Throwable throwable) {
		super(throwable);
	}

	public ValidateException(final String msg, final Throwable throwable) {
		super(msg, throwable);
	}

	public ValidateException(final int status, final String msg) {
		super(status, msg);
	}

	public ValidateException(final int status, final Throwable throwable) {
		super(status, throwable);
	}

	public ValidateException(final String message, final Throwable throwable, final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, throwable, enableSuppression, writableStackTrace);
	}

	public ValidateException(final int status, final String msg, final Throwable throwable) {
		super(status, msg, throwable);
	}
}