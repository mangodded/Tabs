package com.godson.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.godson.tabs.views.CallFragment
import com.godson.tabs.views.ChatFragment
import com.godson.tabs.views.StatusFragment

class WhatsAppAdapter (fm: FragmentManager): FragmentStatePagerAdapter (fm) {
    override fun getCount(): Int {
       return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ChatFragment()
            1 -> StatusFragment()
            2 -> CallFragment()
            else -> ChatFragment ()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Chats"
            1 -> "Status"
            2 -> "Calls"
            else -> "Chats"
        }
    }
}