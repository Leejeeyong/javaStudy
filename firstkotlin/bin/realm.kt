import java.awt.*
import java.awt.event.*
import javax.swing.*
class CheckBoxItem internal constructor():JFrame() {
  internal var contentPane:Container
  internal var res = 0
  internal var cherryIcon = ImageIcon("images/cherry.jpg")
  internal var selectedCherryIcon = ImageIcon("images/selectedCherry.jpg")
  internal var L1 = JLabel("사과 1200원 배 2000원 체리 4000원")
  internal var L2 = JLabel("현재가격은" + res + "원")
  internal var apple = JCheckBox("사과")
  internal var pear = JCheckBox("배")
  internal var cherry = JCheckBox("체리", cherryIcon)
  init{
    setTitle("체크박스 만들기 예제")
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    contentPane = getContentPane()
    contentPane.setLayout(FlowLayout())
    cherry.setBorderPainted(true)
    apple.setBorderPainted(true)
    pear.setBorderPainted(true)
    contentPane.add(L1)
    contentPane.add(apple)
    contentPane.add(pear)
    contentPane.add(cherry)
    contentPane.add(L2)
    apple.addItemListener(EventLister())
    pear.addItemListener(EventLister())
    cherry.addItemListener(EventLister())
    setSize(240, 150)
    setVisible(true)
  }
  inner class EventLister:ItemListener {
    public override fun itemStateChanged(e:ItemEvent) {
      var selected = 1
      if (e.getStateChange() == ItemEvent.SELECTED)
      {
        selected = 1
      }
      else
      {
        selected = -1
      }
      if (e.getItem() === apple)
      {
        res = res + selected * 1200
        L2.setText("현재가격은" + res + "원")
      }
      else if (e.getItem() === pear)
      {
        res = res + selected * 2000
        L2.setText("현재가격은" + res + "원")
      }
      else
      {
        cherry.setSelectedIcon(selectedCherryIcon)
        res = res + selected * 4000
        L2.setText("현재가격은" + res + "원")
      }
    }
  }
  companion object {
    @JvmStatic fun main(args:Array<String>) {
      CheckBoxItem()
    }
  }
}