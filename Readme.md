#Docker Commands

**_To check Docker images**_
docker images

_**To check Running Containers**_
docker ps

**_To check all containers**_
docker ps -a

**_To remove Containers**_
docker rm {container name}

**_To remove image**_
docker rm {image name}

**_To Search in registry**_
docker search {name}
**_To create**_ 
docker create {container name}_**_

**_To pull**_
docker pull {container name}


to check items in image
docker exec {image-name} le -a

To build
docker-compose up build --name {container name}