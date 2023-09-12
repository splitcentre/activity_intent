package com.example.activity_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.ContentValues.TAG
import android.content.Intent
import com.example.activity_intent.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val TAG="Lifecycle"
    private val EXTRA_NAME="EXT_NAME"
    private lateinit var binding: ActivityMainBinding
    companion object{
        const val EXTRA_NAME="extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnTosecac.setOnClickListener{
                val intentTosecac=
                    Intent(this@MainActivity,MainActivity2::class.java)
                intentTosecac.putExtra(EXTRA_NAME,edtName.text.toString())
                startActivity(intentTosecac)
            }
            btn_sendmsg.setOnClickListener{
                val intent=Intent(Intent.ACTION_SEND)
                intent.type="text/plain"
                intent.putExtra(intent.EXTRA_TEXT,)
            }
        }
        Log.d(TAG,"onCreate:dipanggil")
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart:dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume:dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause:dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop:dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy:dipanggil")
    }
}