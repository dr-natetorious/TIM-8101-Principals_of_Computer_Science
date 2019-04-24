class se.emilsjolander.stickylistheaders.StickyListHeadersListView$3 implements android.view.View$OnTouchListener {
  final android.view.View$OnTouchListener a;

  final se.emilsjolander.stickylistheaders.StickyListHeadersListView b;

  se.emilsjolander.stickylistheaders.StickyListHeadersListView$3(se.emilsjolander.stickylistheaders.StickyListHeadersListView, android.view.View$OnTouchListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/view/View$OnTouchListener;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public boolean onTouch(android.view.View, android.view.MotionEvent);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/view/View$OnTouchListener;
       4: aload_0
       5: getfield      #19                 // Field b:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
       8: aload_2
       9: invokeinterface #29,  3           // InterfaceMethod android/view/View$OnTouchListener.onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z
      14: ireturn
}
