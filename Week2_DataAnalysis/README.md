# How to startup the snap project

Run this docker image

```
docker run --rm -it -p 8888:8888 --name snappy -v %cd%:/home/jovyan/work jupyter/datascience-notebook
```

This will display the notebook token such as:

```
s:\personal\ncu\TIM-8101-Principals_of_Computer_Science\Week2_DataAnalysis>docker run -it -p 8888:8888 --name snappy -v %cd%:/home/jovyan/work jupyter/datascience-notebook
Executing the command: jupyter notebook
[I 02:59:13.864 NotebookApp] Writing notebook server cookie secret to /home/jovyan/.local/share/jupyter/runtime/notebook_cookie_secret
[I 02:59:14.539 NotebookApp] JupyterLab extension loaded from /opt/conda/lib/python3.7/site-packages/jupyterlab
[I 02:59:14.539 NotebookApp] JupyterLab application directory is /opt/conda/share/jupyter/lab
[I 02:59:14.542 NotebookApp] Serving notebooks from local directory: /home/jovyan
[I 02:59:14.542 NotebookApp] The Jupyter Notebook is running at:
[I 02:59:14.542 NotebookApp] http://(f43af29f5da7 or 127.0.0.1):8888/?token=727d687f6ac8ed6b3369cc3c27fa2f0f3f2fc34dd3e27c13
[I 02:59:14.542 NotebookApp] Use Control-C to stop this server and shut down all kernels (twice to skip confirmation).
[C 02:59:14.548 NotebookApp]

    To access the notebook, open this file in a browser:
        file:///home/jovyan/.local/share/jupyter/runtime/nbserver-6-open.html
    Or copy and paste one of these URLs:
        http://(f43af29f5da7 or 127.0.0.1):8888/?token=727d687f6ac8ed6b3369cc3c27fa2f0f3f2fc34dd3e27c13
```        