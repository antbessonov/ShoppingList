package com.example.shoppinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItemUseCase(shopItem: ShopItem)

    fun getShopItemUseCase(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>

}