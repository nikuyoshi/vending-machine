/*
 * Copyright 2016 Hiroki Uchida
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nikuyoshi.com.github.currency;

/**
 * @author nikuyoshi
 */
public enum Bill {
    ONE_THOUSAND(1000),
    TWO_THOUSAND(2000),
    FIVE_THOUSAND(5000),
    TEN_THOUSAND(10000);

    private int amount;

    Bill(int amount){
        this.amount = amount;
    }
    
    public int getNumber(){
        return this.amount;
    }
}
