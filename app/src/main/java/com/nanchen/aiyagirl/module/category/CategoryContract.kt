package com.nanchen.aiyagirl.module.category

import com.nanchen.aiyagirl.base.BasePresenter
import com.nanchen.aiyagirl.base.BaseView
import com.nanchen.aiyagirl.model.Data
import com.nanchen.aiyagirl.model.ResultsBean

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-04-14  10:14
 */


interface ICategoryView : BaseView {

    val categoryName: String

    fun getCategoryItemsFail(failMessage: String)

    fun setCategoryItems(data: List<Data>)

    fun addCategoryItems(data: List<Data>)

    fun showSwipeLoading()

    fun hideSwipeLoading()

    fun setLoading()

    fun setNoMore()
}

interface ICategoryPresenter : BasePresenter {

    fun getCategoryItems(isRefresh: Boolean)
}
