/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

class CatData {
    /**
     *get sample data
     */
    fun getCatList(): List<Cat> {
        return listOf(
            Cat(
                1,
                "Snowball",
                R.drawable.cat_1,
                "Asian Semi-longhair",
                1,
                "female",
                "The Asian Semi-Longhair is a cat breed similar to the Asian Shorthair except it has semi-long fur. The breed is also known by the name Tiffanie. It is recognized in any of the Asian Shorthair or Burmese colors and patterns. Like the Asian Shorthair, the breed was developed in Asia and is not currently recognized by any U.S. Registries. It has full recognition in the GCCF.[1] It is related to, and in some registries distinct from, the Chantilly-Tiffany or Foreign Longhair, the North American variant."
            ),
            Cat(
                2,
                "SnowWhite",
                R.drawable.cat_2,
                "munchkin",
                1,
                "female",
                "The Munchkin cat or Sausage cat is a relatively new breed of cat characterized by its very short legs, which are caused by a genetic mutation. The Munchkin is considered to be the original breed of dwarf cat.\n" +
                    "\n" +
                    "Much controversy erupted over the breed when it was recognized by The International Cat Association (TICA) in 1995 with critics voicing concern over potential health and mobility issues. Many pedigree cat associations around the world have refused to recognize the Munchkin cat due to the welfare of the breed and severity of the health issues, including the Governing Council of the Cat Fancy (GCCF)."
            ),
            Cat(
                3,
                "Snowbird",
                R.drawable.cat_3,
                "MaineCoon",
                3,
                "male",
                "The Maine Coon is a large domesticated cat breed. It has a distinctive physical appearance and valuable hunting skills. It is one of the oldest natural breeds in North America, specifically native to the US state of Maine,[3] where it is the official state cat."
            ),
            Cat(
                4,
                "Snowbell",
                R.drawable.cat_4,
                "Devon Rex",
                2,
                "male",
                "The Devon Rex is a breed of intelligent, tall-eared, short-haired cat that emerged in England during the late 1950s. They are known for their slender bodies, wavy coat, and large ears. This breed of cat is capable of learning difficult tricks but can be hard to motivate.\r\n" +
                    "The Devon Rex is a breed of cat with a curly, very soft short coat similar to that of the Cornish Rex. They are often thought of as one of the most hypoallergenic cats available because of their type of coat. However, they are technically not hypoallergenic.\n" +
                    "\n" + "The first Devon was discovered by Beryl Cox in Buckfastleigh, Devon, UK, in 1959. The breed was initially thought to be linked with the Cornish Rex; however, test mating proved otherwise."
            ),
            Cat(
                5,
                "Snowkitty",
                R.drawable.cat_5,
                "American_Wirehair",
                4,
                "female",
                "The American Wirehair is a breed of domestic cat originating in upstate New York. As of 2017, though the breed is well-known, it is ranked as the most rare of the 41 Cat Fanciers' Association breeds."
            )
        )
    }
}
