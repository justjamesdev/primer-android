/*
 * Copyright 2014 http://Bither.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.primer.ui.base;

import android.content.Context;
import android.util.AttributeSet;

import org.primer.R;

public class BalanceBtcToMoneyButton extends BtcToMoneyButton {

	public BalanceBtcToMoneyButton(Context context) {
		super(context);
	}

	public BalanceBtcToMoneyButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public BalanceBtcToMoneyButton(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void setBackgroundResource(int resid) {
		super.setBackgroundResource(R.drawable.btn_small_blue_selector);
	}
}
