package com.example.pluscal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

	lateinit var ca:Button
	lateinit var b0:Button
	lateinit var b1:Button
	lateinit var b2:Button
	lateinit var b3:Button
	lateinit var b4:Button
	lateinit var b5:Button
	lateinit var b6:Button
	lateinit var b7:Button
	lateinit var b8:Button
	lateinit var b9:Button
	lateinit var plus:Button
	lateinit var same:Button
	lateinit var show:TextView

	//show 창에 보여질 숫자
	var num = ""

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		ca = findViewById(R.id.ca)
		b0 = findViewById(R.id.b0)
		b1 = findViewById(R.id.b1)
		b2 = findViewById(R.id.b2)
		b3 = findViewById(R.id.b3)
		b4 = findViewById(R.id.b4)
		b5 = findViewById(R.id.b5)
		b6 = findViewById(R.id.b6)
		b7 = findViewById(R.id.b7)
		b8 = findViewById(R.id.b8)
		b9 = findViewById(R.id.b9)
		plus = findViewById(R.id.plus)
		same = findViewById(R.id.same)
		show = findViewById(R.id.show)

		//'=' 버튼 클릭 시 기존 계산식들을 '+'를 기준으로 분리해 resultList로 저장
		// 이후 result 변수에 각 숫자들을 더해서 저장.
		// 마지막으로 num에 result 변수를 String으로 변환해 저장 후 show 창에 출력
		same.setOnClickListener {
			val resultList:List<String> = num.split(" + ")
			var result = 0
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

		onClickNumberButton()

		// 각 숫자 버튼 클릭 시 출력 값(num)에 숫자 추가됨
//		b0.setOnClickListener {
//			num+="0"
//			show.text = num
//		}
//		b1.setOnClickListener {
//			num+="1"
//			show.text = num
//		}
//		b2.setOnClickListener {
//			num+="2"
//			show.text = num
//		}
//		b3.setOnClickListener {
//			num+="3"
//			show.text = num
//		}
//		b4.setOnClickListener {
//			num+="4"
//			show.text = num
//		}
//		b5.setOnClickListener {
//			num+="5"
//			show.text = num
//		}
//		b6.setOnClickListener {
//			num+="6"
//			show.text = num
//		}
//		b7.setOnClickListener {
//			num+="7"
//			show.text = num
//		}
//		b8.setOnClickListener {
//			num+="8"
//			show.text = num
//		}
//		b9.setOnClickListener {
//			num+="9"
//			show.text = num
//		}


	}

	// 각 숫자 버튼 클릭 시 출력 값(num)에 숫자 추가됨
	fun onClickNumberButton(){
		val buttonList:List<Button> = listOf(
			b0,b1,b2,b3,b4,b5,b6,b7,b8,b9
		)

		buttonList.forEach {
			it.setOnClickListener {
				num+=(it as TextView).text
				show.text = num
			}
		}
	}
}