import java.awt.*
import java.awt.event.*
import javax.swing.*
class CheckBoxItem internal constructor():JFrame() {
  internal var contentPane:Container
  internal var res = 0
  internal var cherryIcon = ImageIcon("images/cherry.jpg")
  internal var selectedCherryIcon = ImageIcon("images/selectedCherry.jpg")
  internal var L1 = JLabel("��� 1200�� �� 2000�� ü�� 4000��")
  internal var L2 = JLabel("���簡����" + res + "��")
  internal var apple = JCheckBox("���")
  internal var pear = JCheckBox("��")
  internal var cherry = JCheckBox("ü��", cherryIcon)
  init{
    setTitle("üũ�ڽ� ����� ����")
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
        L2.setText("���簡����" + res + "��")
      }
      else if (e.getItem() === pear)
      {
        res = res + selected * 2000
        L2.setText("���簡����" + res + "��")
      }
      else
      {
        cherry.setSelectedIcon(selectedCherryIcon)
        res = res + selected * 4000
        L2.setText("���簡����" + res + "��")
      }
    }
  }
  companion object {
    @JvmStatic fun main(args:Array<String>) {
      CheckBoxItem()
    }
  }
}