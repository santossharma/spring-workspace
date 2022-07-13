Run using below command
-
- docker compose up
- run Prometheus - http://localhost:9090/graph
- run Grafana - http://localhost:3000

Grafana Configuration
-
    While creating Graphana Datasource enter URL as 'http://prometheus:9090' since we are running inside the container. 
    Create Dashboard importing prometheus-dashboard.json
