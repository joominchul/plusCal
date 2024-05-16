package com.example.pluscal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val ca:Button = findViewById(R.id.ca)
		val b0:Button = findViewById(R.id.b0)
		val b1:Button = findViewById(R.id.b1)
		val b2:Button = findViewById(R.id.b2)
		val b3:Button = findViewById(R.id.b3)
		val b4:Button = findViewById(R.id.b4)
		val b5:Button = findViewById(R.id.b5)
		val b6:Button = findViewById(R.id.b6)
		val b7:Button = findViewById(R.id.b7)
		val b8:Button = findViewById(R.id.b8)
		val b9:Button = findViewById(R.id.b9)
		val plus:Button = findViewById(R.id.plus)
		val same:Button = findViewById(R.id.same)
		val show:TextView = findViewById(R.id.show)

		//show 창에 보여질 숫자
		var num:String = ""

		//'=' 버튼 클릭 시 기존 계산식들을 '+'를 기준으로 분리해 resultList로 저장
		// 이후 result 변수에 각 숫자들을 더해서 저장.
		// 마지막으로 num에 result 변수를 String으로 변환해 저장 후 show 창에 출력
		same.setOnClickListener {
			val resultList:List<String> = num.split(" + ")
			var result:Int = 0
			resultList.forEach {
				result+=it.toInt()
			}
			num = result.toString()
			show.text = num
		}

		//'CA' 버튼 클릭 시 출력 값 초기화
		ca.setOnClickListener {
			num = ""
			show.text = num
		}

		//'+' 버튼 클릭 시 더하기 기호 추가
		plus.setOnClickListener {
			num += " + "
			show.text = num
		}

		// 각 숫자 버튼 클릭 시 출력 값(num)에 숫자 추가됨
		b0.setOnClickListener {
			num+="0"
			show.text = num
		}
		b1.setOnClickListener {
			num+="1"
			show.text = num
		}
		b2.setOnClickListener {
			num+="2"
			show.text = num
		}
		b3.setOnClickListener {
			num+="3"
			show.text = num
		}
		b4.setOnClickListener {
			num+="4"
			show.text = num
		}
		b5.setOnClickListener {
			num+="5"
			show.text = num
		}
		b6.setOnClickListener {
			num+="6"
			show.text = num
		}
		b7.setOnClickListener {
			num+="7"
			show.text = num
		}
		b8.setOnClickListener {
			num+="8"
			show.text = num
		}
		b9.setOnClickListener {
			num+="9"
			show.text = num
		}


	}
}