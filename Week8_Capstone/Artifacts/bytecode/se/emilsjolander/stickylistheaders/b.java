class se.emilsjolander.stickylistheaders.b extends se.emilsjolander.stickylistheaders.f implements android.widget.Checkable {
  public se.emilsjolander.stickylistheaders.b(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #10                 // Method se/emilsjolander/stickylistheaders/f."<init>":(Landroid/content/Context;)V
       5: return

  public boolean isChecked();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/view/View;
       4: checkcast     #6                  // class android/widget/Checkable
       7: invokeinterface #19,  1           // InterfaceMethod android/widget/Checkable.isChecked:()Z
      12: ireturn

  public void setChecked(boolean);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/view/View;
       4: checkcast     #6                  // class android/widget/Checkable
       7: iload_1
       8: invokeinterface #23,  2           // InterfaceMethod android/widget/Checkable.setChecked:(Z)V
      13: return

  public void toggle();
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #26                 // Method isChecked:()Z
       5: iconst_1
       6: ixor
       7: invokevirtual #27                 // Method setChecked:(Z)V
      10: return
}
