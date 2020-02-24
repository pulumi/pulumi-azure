// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

export module Kinds {
    export const App:         Kind = "App";
    export const Elastic:     Kind = "elastic";
    export const FunctionApp: Kind = "FunctionApp";
    export const Linux:       Kind = "Linux";
    export const Windows:     Kind = "Windows";
    export const Xenon:       Kind = "xenon";
}

export type Kind =
    "App"         |
    "elastic"     |
    "FunctionApp" |
    "Linux"       |
    "Windows"     |
    "xenon"       ;
