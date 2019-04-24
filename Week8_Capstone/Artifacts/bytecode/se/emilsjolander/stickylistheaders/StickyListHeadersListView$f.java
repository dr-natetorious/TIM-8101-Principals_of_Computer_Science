class se.emilsjolander.stickylistheaders.StickyListHeadersListView$f implements android.widget.AbsListView$OnScrollListener {
  final se.emilsjolander.stickylistheaders.StickyListHeadersListView a;

  se.emilsjolander.stickylistheaders.StickyListHeadersListView$f(se.emilsjolander.stickylistheaders.StickyListHeadersListView, se.emilsjolander.stickylistheaders.StickyListHeadersListView$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #22                 // Method "<init>":(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)V
       5: return

  public void onScroll(android.widget.AbsListView, int, int, int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
       4: invokestatic  #27                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.f:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/widget/AbsListView$OnScrollListener;
       7: ifnull        27
      10: aload_0
      11: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      14: invokestatic  #27                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.f:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/widget/AbsListView$OnScrollListener;
      17: aload_1
      18: iload_2
      19: iload_3
      20: iload         4
      22: invokeinterface #29,  5           // InterfaceMethod android/widget/AbsListView$OnScrollListener.onScroll:(Landroid/widget/AbsListView;III)V
      27: aload_0
      28: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      31: aload_0
      32: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      35: invokestatic  #33                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.g:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Lse/emilsjolander/stickylistheaders/g;
      38: invokevirtual #38                 // Method se/emilsjolander/stickylistheaders/g.a:()I
      41: invokestatic  #41                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.a:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;I)V
      44: return

  public void onScrollStateChanged(android.widget.AbsListView, int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
       4: invokestatic  #27                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.f:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/widget/AbsListView$OnScrollListener;
       7: ifnull        24
      10: aload_0
      11: getfield      #15                 // Field a:Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;
      14: invokestatic  #27                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.f:(Lse/emilsjolander/stickylistheaders/StickyListHeadersListView;)Landroid/widget/AbsListView$OnScrollListener;
      17: aload_1
      18: iload_2
      19: invokeinterface #45,  3           // InterfaceMethod android/widget/AbsListView$OnScrollListener.onScrollStateChanged:(Landroid/widget/AbsListView;I)V
      24: return
}
