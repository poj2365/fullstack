package com.objarr.common;

import com.objarr.model.vo.Fruit;

public interface FruitFilter { // 03/19
	boolean checkFruit(Fruit f, Object value);
}
